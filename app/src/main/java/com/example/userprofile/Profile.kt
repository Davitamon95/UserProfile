package com.example.userprofile

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
/**
 * parcialize zorgt ervoor dat data class tussen meerdere activity gebruikt kan worden
 */
@Parcelize
data class Profile (
    val firstName: String,
    val lastName: String,
    val description: String,
    val imageUri: Uri?
) : Parcelable