package uz.mahmudxon.dagger2tutorial.model

import android.util.Log
import uz.mahmudxon.dagger2tutorial.MainActivity
import javax.inject.Inject

class Car @Inject constructor( wheel: Wheel)
{
    @Inject lateinit var engine: Engine
    fun drive()
    {
        Log.i("TTT", "vroom......")
    }

    @Inject
    fun enabledRemote(remote: Remote)
    {
        remote.setListener(this)
    }

}