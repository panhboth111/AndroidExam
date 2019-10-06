package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "You can see that functions are defined with the fun keyword, and that semicolons are now optional when newlines are present. The val keyword declares a read-only property or local variable. Similarly, the var keyword declares a mutable property or local variable.\n" +
                "\n" +
                "Nevertheless, Kotlin is strongly typed. The val and var keywords can be used only when the type can be inferred. Otherwise you need to declare the type. Type inference seems to be improving with each release of Kotlin.\n" +
                "\n" +
                "Have a look at the function declaration near the top of both panes. The return type in Java precedes the prototype, but in Kotlin it succeeds the prototype, demarcated with a colon as in Pascal.\n" +
                "\n" +
                "It is not obvious from this example, but Kotlin has relaxed Java’s requirement that functions be class members. In Kotlin, functions may be declared at top level in a file, locally inside other functions, as a member function inside a class or object, and as an extension function. Extension functions provide the C#-like ability to extend a class with new functionality without having to inherit from the class or use any type of design pattern such as Decorator.\n" +
                "\n" +
                "For Groovy fans, Kotlin implements builders; in fact, Kotlin builders can be type checked. Kotlin supports delegated properties, which can be used to implement lazy properties, observable properties, vetoable properties, and mapped properties.\n" +
                "\n" +
                "Many asynchronous mechanisms available in other languages can be implemented as libraries using Kotlin coroutines, which are experimental in Kotlin 1.1. This includes async/await from C# and ECMAScript, channels and select from Go, and generators/yield from C# and Python."
    }
}
