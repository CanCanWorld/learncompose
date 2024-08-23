package com.zrq.learncompose.type

import androidx.annotation.DrawableRes
import com.zrq.learncompose.R

class User(
  val id: String,
  val name: String,
  @DrawableRes val avatar: Int
) {
  companion object {
    val Me: User = User("rengwuxian", "扔物线-朱凯", R.drawable.avatar_rengwuxian)
  }
}