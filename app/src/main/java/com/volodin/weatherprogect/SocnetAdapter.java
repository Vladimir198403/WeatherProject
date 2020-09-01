package com.volodin.weatherprogect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SocnetAdapter extends RecyclerView.Adapter<SocnetAdapter.ViewHolder> {

    private String[] dataSource;
    public OnItemClickListener itemClickListener; //слушатель нажатий
    View v;

    // Передаем в конструктор источник данных
    // В нашем случае это массив, но может быть и запросом к БД
    public SocnetAdapter(String[] dataSource) {
        this.dataSource = dataSource;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // Создаем новый элемент пользовательского интерфейса
        // Через Inflater
        v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_for_activity_choice_city, viewGroup, false);
        // Здесь можно установить всякие параметры
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull SocnetAdapter.ViewHolder
                                         viewHolder, int i) {

        // Получить элемент из источника данных (БД, интернет...)
        // Вынести на экран используя ViewHolder
        viewHolder.getTextView().setText(dataSource[i]);
    }

    // Вернуть размер данных, вызывается менеджером
    @Override
    public int getItemCount() {
        return dataSource.length;
    }

    //интерфейс для обработки нажатий
    public interface OnItemClickListener {
        void onItemClick(View v, int adapterPosition);
    }

    //сеттер слушателя нажатий
    public void SetOnClickListener(OnItemClickListener itemClickListener) {
        this.itemClickListener = (OnItemClickListener) itemClickListener;
    }

    // Этот класс хранит связь между данными и элементами View
    // Сложные данные могут потребовать несколько View на
    // один пункт списка
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView;

            //обработчик нажатий
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemClick(v, getAdapterPosition());
                    }
                }
            });


        }

        public TextView getTextView() {
            return textView;
        }
    }

}
