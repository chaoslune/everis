package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ListAgendaActivityBinding
import com.example.myapplication.ui.main.ListAgendaFragment

class list_agenda : Fragment(R.layout.list_agenda_activity) {

    private lateinit var binding: ListAgendaActivityBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = ListAgendaActivityBinding.bind(view)

        val bundle: Bundle? = intent.extras

        if(bundle != null) {
            var lstContent = intent.getStringArrayExtra("A")

            var arrayAdapter: ArrayAdapter<*>
            var lstView = binding.listView

            arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lstContent)

            lstView.adapter = arrayAdapter

        }else{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }


    fun clickVoltar(view: View) {
        val i = Intent(this, MainActivity::class.java)
        i.putExtra("A", "Vortei")
        i.putExtra("B", "Vortei2")
        startActivity(i)
    }
}