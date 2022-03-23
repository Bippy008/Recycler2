package kg.geektech.a3homework52;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView contactTv;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        contactTv = itemView.findViewById(R.id.contact_tv);
    }

    public void bind(String contact) {
        contactTv.setText(contact);
    }
}
