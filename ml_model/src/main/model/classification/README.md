## How to run experiments

1. Add the experiments to the experiments.jsonl file. 
Here the first element in the features array is the control variable.
eg: 
```
{"experiment_id": "exp1-Kendals-PBU", "features": ["warnings_checker_framework", "MIDQ (min)" ,"NM (avg)","TC (avg)","Identifiers length (avg)","Line length (max)","Comments (Visual X)","Numbers (Visual X)"], "target": "PBU", "use_SMOTE" :false}
```

2. Create the conda environment using the following command and activate it:
```
    conda env create -f environment.yml
    conda activate ml_model
```

3. Copy the absolute path of the model folder and paste it as the ROOT_PATH in the main.py(line 70) file and Results/compare_results.py(line 12) file.
```
    ROOT_PATH = "path/to/the/folder/model/"
```

4. Run the experiments using the following command:
```
    python3 main.py --output_file /path/to/the/output/file.csv
```

5. To generate results for the experiments, run the following command:
```
    python3 Results/compare_results.py
```