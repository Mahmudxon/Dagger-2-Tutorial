package uz.mahmudxon.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.mahmudxon.dagger2tutorial.model.Car
import uz.mahmudxon.dagger2tutorial.model.component.CarComponent
import uz.mahmudxon.dagger2tutorial.model.component.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent : CarComponent = DaggerCarComponent.create()
        car = carComponent.getCar()
        car.drive()
    }
}
