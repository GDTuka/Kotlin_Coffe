package com.example.kotlin_test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class Animal{
    var power:Int = 0;
    var name:String = "0";
    constructor(power:Int, name:String){
        this.power = power
        this.name = name
    }
    fun getWinner(fiterOne:Animal , fiteTwo:Animal):String{
        if (fiterOne.power > fiteTwo.power) {
            return fiterOne.name
        } else {
            return fiteTwo.name
        }
    }

}
class MainActivity : AppCompatActivity() {
    private var countTextView: TextView? = null
    private var plusButton:Button? = null
    private var minusButton:Button? = null
    private var priceTextView:TextView? = null
    private var confrim:TextView? = null
    private var makeOrder:Button? = null

    var count = 0;
    var price = 0;
    //lateinit это поздняя инициализации переменной когда мы уверены что она не будет null
    var animal1 = Animal(100,"Slon")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.count)
        plusButton = findViewById(R.id.plus)
        minusButton = findViewById(R.id.minus)
        priceTextView = findViewById(R.id.price)
        confrim = findViewById(R.id.confrim)
        makeOrder = findViewById(R.id.makeOrder)

        plusButton?.setOnClickListener{
            count++
            price = count*5
            priceTextView?.text = price.toString()
            countTextView?.text = count.toString()
        }
        minusButton?.setOnClickListener{
            count--
            price = count*5
            priceTextView?.text = price.toString()
            countTextView?.text = count.toString()
        }
        makeOrder?.setOnClickListener{
            confrim?.text = "your order is confirmed ${countTextView?.text} coffe for $${price} "
        }
    }

}

