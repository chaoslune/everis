package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle: Bundle? = intent.extras
        if(bundle != null) {

            var n = binding.editTextNome
            var t = binding.editTextTelefone

            val string: String? = intent.getStringExtra("A")
            val string2: String? = intent.getStringExtra("B")

            n.setText(string)
            t.setText(string2)

        }

    }

    class AddContato (contato: String, telefone: String){
        var contato: String
        var telefone: String

            get() {
                return  this.contato
                        this.telefone

            }
            set(value) {
                this.contato = contato
                this.telefone = telefone
            }

        init{ this.contato = contato
            this.telefone = telefone}
    }

    fun adicionarContato (view: View){

        var n = binding.editTextNome.text.toString()
        var t = binding.editTextTelefone.text.toString()
        var novoContato = AddContato(n, t)
    }

    fun clickListar(view: View) {
        var novoContato = AddContato("a", "b")
        val i = Intent(this, list_agenda::class.java)

       /*val users = novoContato
        i.putExtra("A", users)
        */

        startActivity(i)

    }


}