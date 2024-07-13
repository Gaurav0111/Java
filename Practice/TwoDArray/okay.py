import os
import zipfile

# Define the folder structure with detailed steps
assignment_structure = {
    "Assignment": {
        "Question1": {
            "description.txt": """Set up a domain, set up a server on a VM, and use the DNS server for traffic.

Steps:

1. **Set up a domain on a DNS provider:**
   - Register a domain through a DNS provider like GoDaddy or Namecheap.
   - Follow the provider’s instructions to complete the registration.

2. **Create a Virtual Machine (VM) on Azure:**
   - Log in to the Azure Portal.
   - Navigate to "Virtual Machines" and click "Create".
   - Choose the necessary configurations (e.g., image, size, region).
   - Set up authentication (SSH key or password).
   - Review and create the VM.

3. **Configure the DNS settings to point to the VM:**
   - Once the VM is created, note its public IP address.
   - Log in to your DNS provider’s control panel.
   - Add an “A” record for your domain, pointing to the VM’s public IP address.

4. **Ensure the VM is set up to handle web traffic:**
   - Install a web server on your VM (e.g., Apache, Nginx).
   - Open the necessary ports in the Azure portal (e.g., port 80 for HTTP, port 443 for HTTPS).

Resources:
- [Azure Virtual Network Overview](https://learn.microsoft.com/en-us/azure/virtual-network/virtual-networks-overview)
- [YouTube Video](https://youtu.be/57ZwdztCx2w)""",
            "resources.txt": "- https://youtu.be/57ZwdztCx2w\n- https://learn.microsoft.com/en-us/azure/virtual-network/virtual-networks-overview"
        },
        "Question2": {
            "description.txt": """Create and test Azure Application Gateway.

Steps:

1. **Set up an Azure Application Gateway:**
   - Log in to the Azure Portal.
   - Navigate to "Application Gateways" and click "Create".
   - Fill in the necessary details (e.g., name, region, virtual network).
   - Set up the frontend IP, backend pools, and routing rules.

2. **Configure the backend pools, routing rules, and listeners:**
   - Add backend pool members (e.g., VMs, app services).
   - Set up HTTP settings and health probes.
   - Configure listeners and routing rules to handle traffic.

3. **Test the setup to ensure proper functionality:**
   - Deploy a sample application on the backend pool members.
   - Access the application through the Application Gateway’s public IP.
   - Verify the application is reachable and traffic is correctly routed.

Resources:
- [Azure Virtual Network Overview](https://learn.microsoft.com/en-us/azure/virtual-network/virtual-networks-overview)
- [YouTube Video](https://youtu.be/-SRk0hHa-S0)""",
            "resources.txt": "- https://youtu.be/-SRk0hHa-S0\n- https://learn.microsoft.com/en-us/azure/virtual-network/virtual-networks-overview"
        },
        "Question3": {
            "description.txt": """Provide the description mentioned (for row 23).

Description:
Set up a domain, set up a server on a VM, and use the DNS server for traffic. Follow the provided steps and resources to complete the assignment.""",
            "resources.txt": "- https://learn.microsoft.com/en-us/azure/virtual-network/virtual-networks-overview"
        }
    }
}

# Create the folders and files
base_path = "/mnt/data/Assignment"
os.makedirs(base_path, exist_ok=True)

for folder, contents in assignment_structure["Assignment"].items():
    folder_path = os.path.join(base_path, folder)
    os.makedirs(folder_path, exist_ok=True)
    for file, content in contents.items():
        with open(os.path.join(folder_path, file), "w") as f:
            f.write(content)

# Zip the folder
zip_file_path = "/mnt/data/Assignment_Detailed.zip"
with zipfile.ZipFile(zip_file_path, 'w') as assignment_zip:
    for folder, contents in assignment_structure["Assignment"].items():
        folder_path = os.path.join(base_path, folder)
        for file in contents:
            assignment_zip.write(os.path.join(folder_path, file), os.path.relpath(os.path.join(folder_path, file), base_path))

zip_file_path
