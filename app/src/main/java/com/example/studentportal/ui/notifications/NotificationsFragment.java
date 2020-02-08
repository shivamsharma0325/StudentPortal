package com.example.studentportal.ui.notifications;

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
import com.example.studentportal.NotificationAdapter;
import com.example.studentportal.R;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {

    List<Event> productList;
    RecyclerView recyclerView;
    private NotificationsViewModel notificationsViewModel;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
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
                        "march",
                        "Class Cancellation",
                        "Class is cancelled due to Snow Storm. See you in next class.",
                        ""));

        productList.add(
                new Event(
                        2,
                        "",
                        "",
                        "Grades Available",
                        "New grades has been posted. Please check them!",
                        ""));

        productList.add(
                new Event(
                        3,
                        "https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
                        "Feb",
                        "Balance Due",
                        "Please pay balance before due date.",
                        ""));
        productList.add(
                new Event(
                        3,
                        "https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
                        "Feb",
                        "New Event",
                        "A new event has been organized by college. Please visit student adviser to know more.",
                        ""));
        productList.add(
                new Event(
                        4,
                        "https://images.pexels.com/photos/218983/pexels-photo-218983.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
                        "Feb",
                        "Attendance Short",
                        "Your attendance is short in all subjects. Please take care of attendance.",
                        ""));

        //creating recyclerview adapter
        NotificationAdapter eventadapter = new NotificationAdapter(root.getContext(), productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(eventadapter);
        return root;
    }


}