# Use the official Python image as the base image
FROM python:3.10-slim

# Set the working directory in the container
WORKDIR /app

# Copy the requirements file to the working directory
COPY requirements.txt .

# Install the dependencies from the requirements file
RUN pip install --no-cache-dir -r requirements.txt

# Copy the rest of the application code into the container
COPY . .

# Expose the port that the Flask app will run on
EXPOSE 5000

# Set the Flask app entry point
ENV FLASK_APP=api.py

# Define the command to run the Flask app
CMD ["flask", "run", "--host=0.0.0.0", "--port=5000"]