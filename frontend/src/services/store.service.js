import axios from "./axios";

const storeService = {
  getSellerProducts: () => axios.get("/api/client/store/products"),
  getSellerProductsByStatus: (status) =>
    axios.get(`/api/client/store/products/${status}`),
  createProduct: (formData) =>
    axios.post("/api/client/store/products", formData, {
      headers: { "Content-Type": "multipart/form-data" },
    }),
  editProductStatus: (id, status) =>
    axios.put(`/api/client/store/products/${id}/status?status=${status}`),
  editProduct: (id, form) =>
    axios.put(`/api/client/store/products/${id}`, form),
};
export default storeService;
