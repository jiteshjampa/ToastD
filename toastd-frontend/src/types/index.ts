export interface Product {
  id: number;
  title: string;
  imageUrl: string;
  price: number;
  discount?: number;
  category: string;
  tags: string[];
}

export interface ProductList {
  name: string;
  slug: string;
  description: string;
  products: Product[];
}
