package com.example.omar.myroomap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.omar.myroomap.model.User
import com.example.omar.myroomap.ui.UserRecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rc_show:RecyclerView
    lateinit var txt_message:TextView
    lateinit var btnAdd:Button
    //private lateinit var userlist : ArrayList<User>
    var userlist : ArrayList<User> =ArrayList()
     val userRecyclerView:UserRecyclerView = UserRecyclerView()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rc_show=findViewById(R.id.rv_showData)
        txt_message=findViewById(R.id.txt_message)
        btnAdd=findViewById(R.id.btn_add)
        rc_show.adapter=userRecyclerView

        btnAdd.setOnClickListener {
            userlist.add(User("Omar",
                txt_message.text.toString()

            ))
            userRecyclerView.setlist(userlist)
            txt_message.setText("")
        }

    }
}