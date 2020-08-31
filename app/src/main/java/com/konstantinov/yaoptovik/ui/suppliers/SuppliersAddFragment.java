package com.konstantinov.yaoptovik.ui.suppliers;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.gson.Gson;
import com.konstantinov.yaoptovik.Fab;
import com.konstantinov.yaoptovik.MainActivity;
import com.konstantinov.yaoptovik.NetworkService;
import com.konstantinov.yaoptovik.R;
import com.konstantinov.yaoptovik.pojo.Otvet;
import com.konstantinov.yaoptovik.pojo.Suggestions;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SuppliersAddFragment extends Fragment {

    private SuppliersAddViewModel mViewModel;



    public class QueryInn {
        public String query;
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_suppliers_add,
                container, false);
        Button button = (Button) view.findViewById( R.id.buttonFindeOrg );
        final TextView textView = view.findViewById ( R.id.textView );
        final EditText editText = view.findViewById ( R.id.editText );
        button.setOnClickListener(new View.OnClickListener ()
        {
            @Override
            public void onClick(View v)
            {
                textView.setText ( "" );
                Gson gson = new Gson();
                //QueryInn queryInn = gson.fromJson(jsonStr, QueryInn.class);
                String jsonStr =  "{\"query\":\""+  editText.getText ().toString () +"\"}";
                QueryInn queryInn = gson.fromJson(jsonStr, QueryInn.class);
                // do something
                NetworkService.getInstance()// выполняем запрос через retrofit
                        .getJSONApi()
                        .getPostWithID(queryInn)
                        .enqueue(new Callback <Otvet>() {
                            @Override
                            public void onResponse( Call <Otvet> call,
                                                    Response <Otvet> response) {
                                Otvet otvet = response.body();
                                textView.append ( otvet.getSuggestions().get(0).getValue()+ "\n" );
                            }
                            @Override
                            public void onFailure(@NonNull Call <Otvet> call, @NonNull Throwable t) {

                                textView.append("Произошла ошибка при получении запроса!");
                                t.printStackTrace();
                            }
                        });
            }
        });

        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SuppliersAddViewModel.class);
        // TODO: Use the ViewModel


        Fab.fabAction (MainActivity.navController, MainActivity.fab, false);



    }



}
