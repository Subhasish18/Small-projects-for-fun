from PIL import Image
import imageio.v3 as iio
import numpy as np

def resize_image(image, size):
    # Ensure all images are in RGB format (to avoid shape mismatches)
    img = Image.fromarray(np.uint8(image))
    img = img.convert('RGB')
    return img.resize(size, Image.Resampling.LANCZOS)

# Load images
images = [iio.imread('nyan-cat1.png'), iio.imread('nyan-cat2.png'), iio.imread('nyan-cat3.png')]
target_size = (300, 300)

# Resize and convert images to numpy arrays
resized_images = [np.array(resize_image(img, target_size)) for img in images]

# Save as GIF
iio.imwrite('team.gif', resized_images, duration=600, loop=0)
