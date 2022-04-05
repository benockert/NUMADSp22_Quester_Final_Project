package com.benockert.numadsp22_quester_final_project.createQuest.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.benockert.numadsp22_quester_final_project.R;

import java.util.ArrayList;

public class AddActivityCardAdapter extends RecyclerView.Adapter<AddActivityCardHolder> {
    private static final String TAG = "CREATE_QUEST_ACTIVITY_CARD";
    private ArrayList<AddActivityCard> activityCardList;

    public AddActivityCardAdapter(ArrayList<AddActivityCard> activityCardList) {
        this.activityCardList = activityCardList;
    }

    @NonNull
    @Override
    public AddActivityCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_quest_activity_card, parent, false);
        return new AddActivityCardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddActivityCardHolder holder, int position) {
        AddActivityCard currentCard = activityCardList.get(position);

    }

    @Override
    public int getItemCount() {
        return activityCardList.size();
    }
}
