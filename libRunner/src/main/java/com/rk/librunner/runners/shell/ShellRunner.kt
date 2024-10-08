package com.rk.librunner.runners.shell

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.rk.libcommons.R
import com.rk.librunner.RunnerImpl
import com.rk.librunner.commonUtils.runCommand
import java.io.File

class ShellRunner(private val failsafe: Boolean) : RunnerImpl {
  override fun run(file: File, context: Context) {
    if (failsafe) {
      runCommand(
        alpine = false,
        shell = "/system/bin/sh",
        args = arrayOf("-c", file.absolutePath),
        workingDir = file.parentFile!!.absolutePath,
        context = context
      )
    } else {
      runCommand(
        alpine = true,
        shell = "/bin/bash",
        args = arrayOf(file.absolutePath),
        workingDir = file.parentFile!!.absolutePath,
        context = context
      )
    }
  }


  override fun getName(): String {
    return if (failsafe) {
      "Android Shell"
    } else {
      "Alpine Shell"
    }
  }

  override fun getDescription(): String {
    return if (failsafe) {
      "Android"
    } else {
      "Alpine"
    }
  }

  override fun getIcon(context: Context): Drawable? {
    return ContextCompat.getDrawable(
      context, if (failsafe) {
        com.rk.librunner.R.drawable.android
      } else {
        R.drawable.bash
      }
    )
  }

}