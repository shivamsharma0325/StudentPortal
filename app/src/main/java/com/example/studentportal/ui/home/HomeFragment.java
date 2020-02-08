package com.example.studentportal.ui.home;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.studentportal.Event;
import com.example.studentportal.EventAdapter;
import com.example.studentportal.R;
import com.example.studentportal.SliderAdapter;
import com.example.studentportal.ui.RecyclerTouchListener;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    List<Event> productList;

    //the recyclerview
    RecyclerView recyclerView;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        SliderView sliderView = root.findViewById(R.id.imageSlider);
        SliderAdapter adapter = new SliderAdapter(getContext());

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();
        //getting the recyclerview from xml
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);
        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Event(
                        1,
                        "https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
                        "Wednesday, February 26th from 11.45 am to 1.30 pm",
                        "PRACTICE YOUR FRENCH + VISIT MUSEUM FOR FREE !!",
                        "Where? The Montréal Museum of Fine Arts, 2075 Bishop Street – The Michal and Renata Hornstein Pavilion for Peace",
                        "https://www.jechoisismontreal.com/en/events/francolunch-9-at-the-montreal-museum-of-fine-arts/?utm_source=DialogInsight&utm_medium=email&utm_campaign=B2090"));

        productList.add(
                new Event(
                        2,
                        "https://scontent.fybz2-1.fna.fbcdn.net/v/t1.0-9/82017844_2524701054295196_2793206919819427840_o.jpg?_nc_cat=101&_nc_ohc=pnON1kxGvjMAX-WnvfP&_nc_ht=scontent.fybz2-1.fna&oh=157f3e361f73ecfb8ce467197c0ec5e3&oe=5F03776A",
                        "",
                        "JOB FAIR: For ECE students and alumni, IT'S TODAY ",
                        " AT 8300, George St., LaSalle",
                        "https://www.facebook.com/events/2692792040802788/?acontext=%7B%22ref%22%3A%223%22%2C%22ref_newsfeed_story_type%22%3A%22regular%22%2C%22action_history%22%3A%22%5B%7B%5C%22surface%5C%22%3A%5C%22newsfeed%5C%22%2C%5C%22mechanism%5C%22%3A%5C%22feed_story%5C%22%2C%5C%22extra_data%5C%22%3A%5B%5D%7D%5D%22%7D&__xts__%5B0%5D=68.ARAgIu5yV-EmLaXfRT6CC6BwToAn9zvcIUbZzCKuAq1n3SUcrBhP2o9MiAlikVy64iyGYn5zNUfzM3Ro4rZYIQ3J2le16pYpVr5QgM6w5n08IC7wX04OVjJAfH10epDghRwlzUiLkjprNfH9sYRqLUemJz6NWomOcfRSVpIMMcOv4nXsU4m5ggwssSDskKaOucTEoQPMYySWcReo8RlGDVEJ_lTwDWLBFbc8jfS5t8mcM4MXsFkhbz_vUfcTE-6WqV9R0sQUU4XNKK6ehkZD8P6sbhqDkDPOi_kNBDcsmXRkjWB59IPmAC8HjDvjXfYfbf8btoIn3ei4jWU0u58wUnB9Yg&__tn__=HH-R"));

        productList.add(
                new Event(
                        3,
                        "https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
                        "Feb",
                        "FREE things to do in Montreal this February",
                        "Visit Link to know more",
                        "https://www.mtlblog.com/things-to-do/canada/qc/montreal/29-free-things-to-do-in-montreal-this-february-2020?fbclid=IwAR2mc6ufdVFh6MAvJLzktF1xYadqrXz4G8GE6ajM6VZ5_J-N27qA-1k4liE"));
        productList.add(
                new Event(
                        3,
                        "https://scontent.fybz2-1.fna.fbcdn.net/v/t1.0-9/83673800_1012142602487370_1160011932971827200_o.jpg?_nc_cat=109&_nc_ohc=EtiH7pIBmFkAX-bbZKN&_nc_ht=scontent.fybz2-1.fna&oh=c3a507c5675822ae684962d666de33bf&oe=5ED95006",
                        "Feb",
                        "Admissions Open for September,2020",
                        "Visit Link to know more",
                        "https://www.cegepgim.ca/montreal/"));


        //creating recyclerview adapter
        EventAdapter eventadapter = new EventAdapter(root.getContext(), productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(eventadapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(root.getContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Event evt=productList.get(position);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(evt.getUrlArcticle()));
                startActivity(browserIntent);
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        return root;
    }

}