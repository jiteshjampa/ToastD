import { Product } from "@/types";
interface Props {
  product: Product;
}

const ProductCard: React.FC<Props> = ({ product }) => (
  <div className=" border-2 rounded-lg p-4 shadow-md hover:shadow-xl transition">
     <img
      src={product.imageUrl}
      alt={product.title}
      className="w-full  object-cover mb-4 rounded"
    />
    <h2 className="text-lg font-semibold ">{product.title}</h2>
    <p className="text-gray-600">{product.category}</p>
    <p className="text-black font-bold mt-2">${product.price}</p>
    {product.discount && (
      <p className=" text-sm">Discount: {product.discount}%</p>
    )}
    <div className="flex flex-wrap gap-1 mt-2">
      {product.tags.map((tag) => (
        <span key={tag} className="bg-gray-200 text-xs px-2 py-1 rounded">
          {tag}
        </span>
      ))}
    </div>
  </div>
);

export default ProductCard;
