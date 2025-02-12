package com.action.myandroidweek2.hw

    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.ImageView
    import android.widget.TextView
    import android.widget.Toast
    import androidx.recyclerview.widget.RecyclerView
    import com.action.myandroidweek2.R
    import com.action.myandroidweek2.hw.hw.Product
    import com.bumptech.glide.Glide


    class RecyclerAdapter(private val productList: List<Product>) :
        RecyclerView.Adapter<RecyclerAdapter.ProductViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
            return ProductViewHolder(view)
        }

        override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
            val product = productList[position]
            holder.name.text = product.name
            holder.description.text = product.description
            Glide.with(holder.itemView.context).load(product.imageUrl).into(holder.image)

            holder.itemView.setOnClickListener {
                Toast.makeText(
                    holder.itemView.context,
                    "Price: $${product.price}, Rating: ${product.rating}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        override fun getItemCount(): Int = productList.size

        class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val name: TextView = itemView.findViewById(R.id.tvProductName)
            val description: TextView = itemView.findViewById(R.id.tvProductDescription)
            val image: ImageView = itemView.findViewById(R.id.ivProductImage)
        }
    }
