package org.pursuit.dogapiagain.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.pursuit.dogapiagain.fragments.FragmentInterface;

public class DogViewHolder extends RecyclerView.ViewHolder {

    private FragmentInterface fragmentInterface;


    public DogViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
