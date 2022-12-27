package com.example.omar.myroomap.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.omar.myroomap.R
import com.example.omar.myroomap.R.layout.*
import com.example.omar.myroomap.model.User

class UserRecyclerView() :RecyclerView.Adapter<UserRecyclerView.UserViewHolder>() {

    var userlist : ArrayList<User> =ArrayList()

    fun setlist(Userlist : ArrayList<User>)
      {
         this.userlist=Userlist
          notifyDataSetChanged()
      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {


        val view:View=LayoutInflater.from(parent.context).inflate(list_item,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
      val user:User= userlist[position]
        //holder.bind(user)
        holder.iv_Name.text=user.name
        holder.tv_message.text=user.message
    }

    override fun getItemCount(): Int {
        return userlist.size
    }
    //custom class to hold attribute
   inner class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

       val iv_Name = itemView.findViewById<TextView>(R.id.tv_Name)
       val tv_message = itemView.findViewById<TextView>(R.id.tvMessage)

       /* fun bind(user: User) {
            iv_Name.text = user.name
            tv_message.text = user.message

        }*/
    }
}
