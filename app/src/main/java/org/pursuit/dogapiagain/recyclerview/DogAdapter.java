package org.pursuit.dogapiagain.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.pursuit.dogapiagain.fragments.FragmentInterface;
import org.pursuit.dogapiagain.model.Dog;

import java.util.List;

public class DogAdapter extends RecyclerView.Adapter<DogViewHolder> {

    private List<Dog> dogList;
    private FragmentInterface fragmentInterface;

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
