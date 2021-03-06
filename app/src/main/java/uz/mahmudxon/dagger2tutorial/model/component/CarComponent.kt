package uz.mahmudxon.dagger2tutorial.model.component

import dagger.Component
import uz.mahmudxon.dagger2tutorial.MainActivity
import uz.mahmudxon.dagger2tutorial.model.Car

@Component
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

}