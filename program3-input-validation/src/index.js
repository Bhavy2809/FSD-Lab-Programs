/*
 * Program 3 entry point - renders <ValidatedInput /> into <div id="root">
 * Run:  npm install   (first time)   then   npm start   -> http://localhost:3000
 */
import React from "react";
import ReactDOM from "react-dom/client";
import ValidatedInput from "./ValidatedInput";

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<ValidatedInput />);
