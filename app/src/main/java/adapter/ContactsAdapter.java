package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recycler.Contacts;
import com.example.recycler.DetailsActivity;
import com.example.recycler.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList){
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder (@NonNull ViewGroup viewGroup,int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact,viewGroup,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {
        final Contacts contacts = contactsList.get(i);
        contactsViewHolder.imgProfile.setImageResource(contacts.getImageid());
        contactsViewHolder.tvname.setText(contacts.getName());
        contactsViewHolder.tvcontact.setText(contacts.getPhonenumber());


        contactsViewHolder.imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(mContext, DetailsActivity.class);

                intent.putExtra("image",contacts.getImageid());
                intent.putExtra("name",contacts.getName());
                intent.putExtra("phone",contacts.getPhonenumber());
                intent.putExtra("add",contacts.getAddress());
                intent.putExtra("ema",contacts.getEmail());


                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvname,tvcontact;

        public ContactsViewHolder(@NonNull View itemView){
            super(itemView);
            imgProfile=itemView.findViewById(R.id.imgProfile);
            tvname=itemView.findViewById(R.id.tvname);
            tvcontact=itemView.findViewById(R.id.tvcontact);
        }
    }
}
