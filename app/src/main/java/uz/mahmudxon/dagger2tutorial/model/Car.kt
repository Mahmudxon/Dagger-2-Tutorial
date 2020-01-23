package uz.mahmudxon.dagger2tutorial.model

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheel: Wheel)
{
    fun drive()
    {
        Log.i("TTT", "vroom......")
    }
}