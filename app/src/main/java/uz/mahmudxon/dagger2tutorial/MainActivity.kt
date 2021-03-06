package uz.mahmudxon.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mahmudxon.dagger2tutorial.model.Car
import uz.mahmudxon.dagger2tutorial.model.component.CarComponent
import uz.mahmudxon.dagger2tutorial.model.component.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent : CarComponent = DaggerCarComponent.create()
        //car = carComponent.getCar()
        carComponent.inject(this)
        car.drive()
    }
}
