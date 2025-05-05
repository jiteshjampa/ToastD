import { ProductList } from "@/types";
import ProductGrid from "@/components/ProductGrid";
import Header from "@/components/Header";

type Params = Promise<{
  slug: string;
}>;

// Function to fetch list data from the API
async function getListData(slug: string): Promise<ProductList> {
  const baseUrl = process.env.NEXT_PUBLIC_API_URL;
  if (!baseUrl) {
    throw new Error("API URL is not defined in .env.local");
  }

  const res = await fetch(`${baseUrl}/lists/${slug}`, {
    method: "GET",
    headers: {
      "Content-Type": "application/json",
    },
  });

  return res.json();
}

// Server Component
export default async function ListPage({ params }: { params: Params }) {
  // Await the params object first
  const { slug } = params;

  // Fetch the list data with the awaited slug
  const data = await getListData(slug);

  return (
    <div className="p-6">
      <Header />
      <h2 className="text-2xl font-bold mt-4">{data.name}</h2>
      <p className="text-gray-600 mb-6">{data.description}</p>
      <ProductGrid products={data.products} />
    </div>
  );
}
