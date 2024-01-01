# syntax=docker/dockerfile:1
FROM tensorflow/tensorflow:latest-gpu-py3-jupyter
LABEL Uday Jain <uday9k@gmail.com>
WORKDIR /tf
COPY requirements.txt requirements.txt
RUN python -m pip install --no-cache-dir --upgrade -r requirements.txt pip
EXPOSE 8888
# COPY . .
CMD ["jupyter", "notebook", "--port=8888", "--no-browser", "--ip=0.0.0.0", "--allow-root"]
