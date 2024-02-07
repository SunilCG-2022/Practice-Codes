import express from "express";
const app = express();
const port = 3000;

app.listen(port, () => {
    console.log(`Succesfully created the server and running on port ${port}`);
});