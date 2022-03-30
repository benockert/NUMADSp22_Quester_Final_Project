package com.benockert.numadsp22_quester_final_project.PastQuests;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.benockert.numadsp22_quester_final_project.R;

import java.util.ArrayList;

public class pastQuestActivityCardAdapter extends RecyclerView.Adapter<pastQuestActivityCardHolder> {
    private final ArrayList<pastQuestActivityCard> qCardList;

    public pastQuestActivityCardAdapter(ArrayList<pastQuestActivityCard> qCardList) {
        this.qCardList = qCardList;
    }

    /**
     * creates a new recycler view holder initializing private fields to be used by RecyclerView
     *
     * @param parent   ViewGroup
     * @param viewType Integer
     * @return pastQuestHolder
     */
    @NonNull
    @Override
    public pastQuestActivityCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.past_quest_activity_card, parent, false);
        return new pastQuestActivityCardHolder(view);
    }

    /**
     * Called by RecyclerView to display data at a specified position
     *
     * @param holder   pastQuestHolder
     * @param position Integer
     */
    @Override
    public void onBindViewHolder(@NonNull pastQuestActivityCardHolder holder, int position) {
        pastQuestActivityCard currentCard = qCardList.get(position);
        holder.questName.setText(currentCard.getQuestName());
        holder.participants.setText(currentCard.getParticipants());
        Drawable locationPhoto = currentCard.getLocationPhoto();
        locationPhoto.setBounds(0, 0, 100, 100);
        holder.locationImage.setImageDrawable(locationPhoto);
    }

    /**
     * @return Integer size of the past quest card list
     */
    @Override
    public int getItemCount() {
        return this.qCardList.size();
    }
}
