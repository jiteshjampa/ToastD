// app/layout.tsx
import "./globals.css";

export const metadata = {
  title: "Curated Product List",
  description: "Handpicked for your hustle.",
};

export default function RootLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="en">
      <body>{children}</body>
    </html>
  );
}
