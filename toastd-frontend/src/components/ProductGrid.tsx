import ProductCard from "./ProductCard";
import { Product } from "@/types";

interface Props {
  products: Product[];
}

const ProductGrid: React.FC<Props> = ({ products }) => (
  <div className="grid grid-cols-1 d:grid-cols-2 lg:grid-cols-3 gap-6">
    {products.map((product) => (
      <ProductCard key={product.id} product={product} />
    ))}
  </div>
);

export default ProductGrid;
