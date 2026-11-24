/*
 * Program 2 entry point - renders <TextAreaForm /> into <div id="root">
 * Run:  npm install   (first time)   then   npm start   -> http://localhost:3000
 */
import React from "react";
import ReactDOM from "react-dom/client";
import TextAreaForm from "./TextAreaForm";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<TextAreaForm />);
