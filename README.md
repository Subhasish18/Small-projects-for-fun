# Python-GIF
I learned how to make gifs using image.io library, pillow and np and since it's fun, I might add some more as I keep making them occasionally.

Overview

This project is a fun, custom-made GIF animation created using Python.

Files

we got the PNG files.

create_a_gif.py: The Python script used to compile the frames into a looping GIF.

result.gif: The final animated GIF output.

How It Works

The create_a_gif.py script does the following:

Loads the individual frame images using the Imageio and Pillow libraries.

Resize each image to 300x300 pixels for consistency.

Compiles the resized frames into a GIF.

Sets the frame duration to the required milliseconds.

Creates a seamless loop by setting the GIF to loop indefinitely.

Requirements

To run the script, you need the following libraries installed:

pip install pillow imageio

Running the Script

Run the Python script with:

python create_a_gif.py

The final GIF will be saved as (*whatever name we give).gif.
