package com.example.multimodulemvvm.util

import android.content.Context
import android.widget.Toast

fun Context.toast(value: Any?) {
    Toast.makeText(this, value.toString(), Toast.LENGTH_SHORT).show()
}