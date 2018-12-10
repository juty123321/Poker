package com.example.bunnychiu.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    Poker poker = new Poker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PokerAdapter());

    }

    class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PokerHolder>
    @NonNull
    @Override

    public PokerHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.poker_row,parent,false);
        return new PokerHolder(view);
    }

    @Override
    public int getItemCount() {
        return poker.cards.length;
    }

    class  PokerHolder extends RecyclerView.ViewHolder{
        TextView PokerText;
        public PokerHolder(View itemView) {
            super(itemView);
            PokerText =itemView.findViewById(R.id.tv_poker);
        }
    }

}

