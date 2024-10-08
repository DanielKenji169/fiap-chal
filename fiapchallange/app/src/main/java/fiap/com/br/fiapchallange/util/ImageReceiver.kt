package fiap.com.br.fiapchallange.util

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import com.squareup.picasso.Picasso
import com.squareup.picasso.Target
import fiap.com.br.fiapchallange.domain.User
import java.lang.Exception


class ImageReceiver(val user: User): Target {
    override fun onPrepareLoad(placeHolderDrawable: Drawable?) {}

    override fun onBitmapFailed(error: Exception?, errorDrawable: Drawable?) {}

    override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
        user.setAvatarDrawable( bitmap )
    }
}