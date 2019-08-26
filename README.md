# HumAIn

This repository contains the code for Vehicle Number plate Detection 

Pre-processing is done through Gaussian convolution method . Reference:
  https://www.pyimagesearch.com/2016/07/25/convolutions-with-opencv-and-python/
  
The edge detection id done through Roberts operator. Reference:
  https://scikit-image.org/docs/dev/auto_examples/edges/plot_edge_filter.html
  
The segmentation of the thus pre-processed image is done through Contour traversal method. Reference:
  https://gurus.pyimagesearch.com/lesson-sample-segmenting-characters-from-license-plates/
  
The feature extraction logic as explained in the humAIn solution document is coded in java. The logic is written for identification
of the number '2'. It can be extended for all other numbers and alphabets.
