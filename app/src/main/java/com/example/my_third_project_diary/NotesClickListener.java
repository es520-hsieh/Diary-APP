package com.example.my_third_project_diary;

import androidx.cardview.widget.CardView;

import com.example.my_third_project_diary.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
