import os

# Function to write commands and steps to a text file
def write_assignment_to_file(filename):
    with open(filename, 'w') as file:
        file.write("# Azure Assignment\n\n")

        # Step 1: Deploy Linux and Windows Virtual Machines (VMs) and Access Them Using SSH and RDP
        file.write("## 1. Deploy Linux and Windows Virtual Machines (VMs) and Access Them Using SSH and RDP\n\n")

        # Linux VM Deployment and SSH Access
        file.write("### Linux VM Deployment and SSH Access\n")
        file.write("1. **Create a resource group:**\n")
        file.write("   ```sh\n")
        file.write("   az group create --name myResourceGroup --location eastus\n")
        file.write("   ```\n\n")

        file.write("2. **Create a Linux VM:**\n")
        file.write("   ```sh\n")
        file.write("   az vm create \\\n")
        file.write("     --resource-group myResourceGroup \\\n")
        file.write("     --name myLinuxVM \\\n")
        file.write("     --image UbuntuLTS \\\n")
        file.write("     --admin-username azureuser \\\n")
        file.write("     --generate-ssh-keys\n")
        file.write("   ```\n\n")

        file.write("3. **Open port 22 for SSH:**\n")
        file.write("   ```sh\n")
        file.write("   az vm open-port --port 22 --resource-group myResourceGroup --name myLinuxVM\n")
        file.write("   ```\n\n")

        file.write("4. **SSH into the Linux VM:**\n")
        file.write("   ```sh\n")
        file.write("   ssh azureuser@<public-ip-address>\n")
        file.write("   ```\n\n")

        # Windows VM Deployment and RDP Access
        file.write("### Windows VM Deployment and RDP Access\n")
        file.write("1. **Create a Windows VM:**\n")
        file.write("   ```sh\n")
        file.write("   az vm create \\\n")
        file.write("     --resource-group myResourceGroup \\\n")
        file.write("     --name myWindowsVM \\\n")
        file.write("     --image Win2019Datacenter \\\n")
        file.write("     --admin-username azureuser \\\n")
        file.write("     --admin-password myPassword1234\n")
        file.write("   ```\n\n")

        file.write("2. **Open port 3389 for RDP:**\n")
        file.write("   ```sh\n")
        file.write("   az vm open-port --port 3389 --resource-group myResourceGroup --name myWindowsVM\n")
        file.write("   ```\n\n")

        file.write("3. **RDP into the Windows VM:**\n")
        file.write("   - Use an RDP client and connect to `<public-ip-address>` with the username `azureuser` and password `myPassword1234`.\n\n")

        # Step 2: Create an App Service Plan
        file.write("## 2. Create an App Service Plan\n\n")

        file.write("1. **Create an App Service Plan:**\n")
        file.write("   ```sh\n")
        file.write("   az appservice plan create --name myAppServicePlan --resource-group myResourceGroup --sku FREE\n")
        file.write("   ```\n\n")

        # Step 3: Provision a Web App and Deploy a Simple Welcome Page
        file.write("## 3. Provision a Web App and Deploy a Simple Welcome Page\n\n")

        file.write("1. **Create a Web App:**\n")
        file.write("   ```sh\n")
        file.write("   az webapp create --resource-group myResourceGroup --plan myAppServicePlan --name myUniqueAppName\n")
        file.write("   ```\n\n")

        file.write("2. **Deploy a Simple Welcome Page:**\n")
        file.write("   ```sh\n")
        file.write("   echo \"<html><body><h1>Welcome to my Web App!</h1></body></html>\" > index.html\n")
        file.write("   az webapp deployment source config-local-git --name myUniqueAppName --resource-group myResourceGroup\n")
        file.write("   git init\n")
        file.write("   git remote add azure $(az webapp deployment source config-local-git --name myUniqueAppName --resource-group myResourceGroup --query url --output tsv)\n")
        file.write("   git add index.html\n")
        file.write("   git commit -m \"Initial commit\"\n")
        file.write("   git push azure master\n")
        file.write("   ```\n\n")

        # Step 4: Create Azure Container Registry (ACR) and Pull Image from ACR
        file.write("## 4. Create Azure Container Registry (ACR) and Pull Image from ACR\n\n")

        file.write("1. **Create an ACR:**\n")
        file.write("   ```sh\n")
        file.write("   az acr create --resource-group myResourceGroup --name myContainerRegistry --sku Basic\n")
        file.write("   ```\n\n")

        file.write("2. **Log in to ACR:**\n")
        file.write("   ```sh\n")
        file.write("   az acr login --name myContainerRegistry\n")
        file.write("   ```\n\n")

        file.write("3. **Push an Image to ACR:**\n")
        file.write("   ```sh\n")
        file.write("   docker build -t myapp .\n")
        file.write("   docker tag myapp mycontainerregistry.azurecr.io/myapp:v1\n")
        file.write("   docker push mycontainerregistry.azurecr.io/myapp:v1\n")
        file.write("   ```\n\n")

        # Step 5: Create Container Instance and Deploy a Simple Docker Application
        file.write("## 5. Create Container Instance and Deploy a Simple Docker Application\n\n")

        file.write("1. **Create a Container Instance:**\n")
        file.write("   ```sh\n")
        file.write("   az container create --resource-group myResourceGroup --name myContainerInstance --image mycontainerregistry.azurecr.io/myapp:v1 --cpu 1 --memory 1 --registry-login-server mycontainerregistry.azurecr.io --registry-username <username> --registry-password <password>\n")
        file.write("   ```\n\n")

        # Step 6: Create Container Groups and Test Functionality
        file.write("## 6. Create Container Groups and Test Functionality\n\n")

        file.write("1. **Create a Container Group:**\n")
        file.write("   ```sh\n")
        file.write("   az container create --resource-group myResourceGroup --name myContainerGroup --image mycontainerregistry.azurecr.io/myapp:v1 --cpu 1 --memory 1 --registry-login-server mycontainerregistry.azurecr.io --registry-username <username> --registry-password <password>\n")
        file.write("   ```\n\n")

# Get the directory of the current script
current_dir = os.path.dirname(os.path.abspath(__file__))

# Generate the assignment text file in the same directory as the script
write_assignment_to_file(os.path.join(current_dir, "azure_assignment.txt"))
print("Assignment file generated successfully.")
