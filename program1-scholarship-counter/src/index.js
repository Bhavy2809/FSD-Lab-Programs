/*
 * Program 1 entry point - renders <App /> into <div id="root"> of public/index.html
 * Run:  npm install   (first time)   then   npm start   -> http://localhost:3000
 */
import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);
