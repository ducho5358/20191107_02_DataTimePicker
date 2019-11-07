package com.tjoeun.a20191107_02_datatimepicker

import androidx.appcompat.app.AppCompatActivity

class BaseActivity : AppCompatActivity() {


    abstract fun setupEvents()
    abstract fun setValues()

}