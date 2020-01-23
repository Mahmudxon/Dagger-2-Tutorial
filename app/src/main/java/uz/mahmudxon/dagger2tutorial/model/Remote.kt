package uz.mahmudxon.dagger2tutorial.model

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor()
{
    fun setListener(car: Car)
    {
        Log.i("TTT", "Remote is Connected")
    }
}