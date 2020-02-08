package com.example.studentportal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class SliderAdapter  extends SliderViewAdapter<SliderAdapter.SliderAdapterVH> {
    private Context context;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {

        switch (position) {
            case 0:
                Glide.with(viewHolder.itemView)
                        .load("https://www.cegepgim.ca/montreal/banner/bgphotos/bimg57712e9135ed1.jpg")
                        .into(viewHolder.imageViewBackground);
                viewHolder.textViewDescription.setText("Cegep welcomes you!");
                break;
            case 1:
                Glide.with(viewHolder.itemView)
                        .load("https://www.cegepgim.ca/montreal/banner/bgphotos/bimg57712e4c11944.jpg")
                        .into(viewHolder.imageViewBackground);
                viewHolder.textViewDescription.setText("Study in Best Student city in world!");
                break;
            case 2:
                Glide.with(viewHolder.itemView)
                        .load("https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
                        .into(viewHolder.imageViewBackground);
                viewHolder.textViewDescription.setText("Cegep offers photography course now");
                break;
            default:
                Glide.with(viewHolder.itemView)
                        .load("https://www.cegepgim.ca/montreal/banner/bgphotos/bimg57712d03ce38c.jpg")
                        .into(viewHolder.imageViewBackground);
                viewHolder.textViewDescription.setText("Exciting New Programs");
                break;

        }

    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return 4;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground;
        TextView textViewDescription;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            textViewDescription = itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView = itemView;
        }
    }
}
