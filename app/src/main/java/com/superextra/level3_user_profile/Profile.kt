package com.superextra.level3_user_profile

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Profile (
    val firstName: String,
    val lastName: String,
    val description: String,
    val imageUri: Uri?
) : Parcelable