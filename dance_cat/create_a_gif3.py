from PIL import Image
import imageio.v3 as iio
import numpy as np

def resize_image(image, size):
    # Ensure all images are in RGB format (to avoid shape mismatches)
    img = Image.fromarray(np.uint8(image))
    img = img.convert('RGB')
    return img.resize(size, Image.Resampling.LANCZOS)

# Load images
images = [iio.imread('p1.png'), iio.imread('p2.png'), iio.imread('p3.png'), iio.imread('p4.png'),iio.imread('p5.png'),iio.imread('p6.png'),iio.imread('p7.png'),iio.imread('p8.png'),iio.imread('p9.png')]
target_size = (300, 300)

# Resize and convert images to numpy arrays
resized_images = [np.array(resize_image(img, target_size)) for img in images]

# Save as GIF
iio.imwrite('team.gif', resized_images, duration=100, loop=0)
