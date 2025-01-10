package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteAdapter {

    class NoteViewHolder extends RecyclerView.ViewHolder{

        TextView titleView, contentView;

        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.note_title_text_view);
            contentView = itemView.findViewById(R.id.note_content_text_view);
        }
    }
}
